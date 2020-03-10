	grammar TransformationAlgebra;
	// Examples:
	 //ratio fcont interpol pointmeasures temperature deify get pi2 sigmae objectregions Utrecht fcont pi1 interpol pointmeasures temperature deify get pi2 sigmae objectregions Utrecht
	 //reify pi1 sigmale interpol pointmeasures noise deify get pi2 sigmae objectregions Utrecht 20    
	 //sigmae otopo objectregions neighborhoods sigmae objectregions municipalities Utrecht in
     /*
     * Parser Rules
     */
	//Start rules: 
    	start  : 	(r | rr | v );    
    	r 	:	(l | s | q | o);
    	rr 	:	(lq | sq | qs | oq | os);     
    	v	:	(ov | lv | sv| qv) ;
	
	
	
	//value rules
	countv : OCONT o | GET  count | DATAV ; 
	ratiov : FCONT lint | FCONT l  
		| RATIO ratiov WHITESPACE ratiov 
		| OCONT oratio | GET ratio| countv | DATAV ;	
	intv : AVG lint | AVG oint | ratiov  |GET intt | DATAV ;  
	ordv : MAX lord | MIN lord |  MAX oord  | MIN oord |  GET ordinal | intv;  	
	//ratiov : countv;
	//intv : ratiov;
	//ordv : intv ;
	nomv : ordv | GET nom | TOPOV;
	//qv : nomv ;
	qv : GET  q | nomv ;
	sv : REIFY l | GET  s  ;
	//l : DEIFY sv ;
	lv : GET l ;		
	ov : GET  o | KEYWORD ;
	
	
	
	// R rules
	//ratio : count ;
	//ordinal : intt ;
	//nom : ordinal ; 
	//q : nom ;
	l : DEIFY sv | PI1  lint  | PI1  lord  | PI1  lnom | PI1  lq ;	//First apply the most specific function
	s : PI1  sint  | PI1  sord  | PI1  snom | PI1  lq | PI2 os ;	//First apply the most specific function
	o : PI1  os  | PI1  oratio  |  PI1  oint  |  PI1  oord  | PI1  onom| PI1  oq | PI1 onomo |PI2 onomo;
	count : PI2 ocount ;   
	ratio : PI2 oratio | PI2 lratio | count;
	intt : PI1 ints | PI2 oint |  PI2 lint |ratio ;	
	ordinal : PI1  ords | intt ;
	nom : PI1 noms | ordinal ;
	q : PI1  qs | nom ;
	
	// RR rules
	
	//Data rules:
	sint : DATAPM ;
	snom : DATAAMOUNT | sint ;	
	ords : DATACONTOUR ;	
	
	os : SIGMAE2 os WHITESPACE ov | BOWTIE os WHITESPACE o | DATAOBJS ;
	ints : DATACONTOURLINE ; 
	ocount : SIGMAE2 ocount WHITESPACE ov | BOWTIE ocount WHITESPACE o | GROUPBYSUM ocounto | DATAOBJCOUNT ;
	lratio : DATAFIELD ;
	
			
	//ints : ratios ;
	//ords : ints ;
	noms : ords ; 
	qs : noms ;	
	oratio :BOWTIE oratio WHITESPACE o | GROUPBYAVG oratioo | DATAOBJQ | ocount ; 
	oint : SIGMASE2 oint WHITESPACE intv|  BOWTIE oint WHITESPACE o  | GROUPBYAVG ointo |oratio	;
	oord : SIGMASE2 oord WHITESPACE ordv |  BOWTIE oord WHITESPACE o  | groupbyaggord oordo |  oint ;
	onom : oord ;
	oq : SIGMAE2 oq WHITESPACE qv |  BOWTIE oq WHITESPACE o  | onom;
	
		
	//lord : lint ;
	lnom : lord ; 
	//lq : lnom ;
	lint : INTERPOL sint WHITESPACE l | SIGMASE2 lint WHITESPACE intv|  BOWTIE lint WHITESPACE l   | GROUPBYAVG lintl |   lratio   ;
	lord : SIGMASE2 lord WHITESPACE ordv |  BOWTIE lord WHITESPACE l   | groupbyaggord lordl | lint ;
	lq : SIGMAE2 lq WHITESPACE qv | BOWTIE lq WHITESPACE l  |lnom;	
	//sint : sratio ;
	sord : sint ;
	//snom : sord ; 
	sq : snom ;
	
	
	
	
	//RRR rules
	ocounto : BOWTIESTAR onomo WHITESPACE ocount ;
	oratioo : ODIST os WHITESPACE os  |NDIST o WHITESPACE o WHITESPACE oratioo | BOWTIESTAR onomo WHITESPACE oratio ;
	lratiol : LDIST l WHITESPACE l | BOWTIESTAR lnoml WHITESPACE lratio;
	lratioo : LODIST l WHITESPACE o ;
	onomo : OTOPO os WHITESPACE os  | SIGMAE2 onomo WHITESPACE nomv   |  oordo 	;
	lnomo : LOTOPO l WHITESPACE  os ;	
	
	lintl : BOWTIESTAR lnoml WHITESPACE lint  | lratiol ;
	lordl :  SIGMASE2 lordl WHITESPACE ordv  | lintl ; 	
	lnoml :  SIGMAE2 lnoml WHITESPACE nomv |lbooll |lordl; 	
	lbooll : LVIS l WHITESPACE l WHITESPACE oint  | SIGMAE2 lbooll WHITESPACE BOOLV ; 	
	
	oordo :  SIGMASE2 oordo WHITESPACE ordv  |  ointo  ;	
	ointo : BOWTIESTAR onomo WHITESPACE oint  | oratioo ;		
	
	//Group by functions		
	groupbyaggord : GROUPBYMIN |	GROUPBYMAX;
	
	/*
     	* Lexer Rules
     	*/
	//Functions: 	
	AVG : 'avg ' ;
	MIN : 'min ' ;
	MAX : 'max ' ;
	SUM : 'sum ' ;
	REIFY : 'reify ' ;
	DEIFY : 'deify ';
	GET : 'get ' ;
	FCONT :  'fcont ' ;
	OCONT :  'ocont ' ;
	RATIO : 'ratio '  ;
	INTERPOL : 'interpol ' ;
	PI1 : 'pi1 ' ;
	PI2 : 'pi2 ' ;
	SIGMAE2 : 'sigmae '  ; // =
	SIGMASE2 : 'sigmale '  ; // <=
	BOWTIE : 'bowtie ' ;
	BOWTIESTAR : 'bowtie* ';
	//GROUPBY : 'groupby ' ;
	GROUPBYAVG : 'groupby_avg ' ;
	GROUPBYSUM : 'groupby_sum ' ;
	GROUPBYMIN : 'groupby_min ' ;
	GROUPBYMAX : 'groupby_max ' ;
	
	ODIST : 'odist ' ;
	LDIST : 'ldist ';
	LODIST : 'lodist ' ;
	OTOPO : 'otopo ' ;
	LOTOPO : 'lotopo ' ;
	NDIST : 'ndist ' ;
	LVIS : 'lvis ' ;
	
	//Data:
	DATAPM : 'pointmeasures ' KEYWORD ;
	DATAAMOUNT  :  'amountpatches ' KEYWORD ;
  	DATACONTOUR :  'contour '  KEYWORD  ;
	DATAOBJQ :  'objects ' KEYWORD  ;
	DATAOBJS :  'objectregions ' KEYWORD;
	DATACONTOURLINE :  'contourline ' KEYWORD  ;
	DATAOBJCOUNT :  'objectcounts ' KEYWORD  ;
	DATAFIELD :  'field ' KEYWORD ;
	TOPOV : 'in' ;
	BOOLV : 'true '| 'false ';
	
	DATAV : [0-9]+ ;     
    WHITESPACE : ' ';	
	KEYWORD : ('a'..'z' | 'A'..'Z' | '-' | '_')+ ;
	WS  : [ \t\r\n]+ -> skip ;
	