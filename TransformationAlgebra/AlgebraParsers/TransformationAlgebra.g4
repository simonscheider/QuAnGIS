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
	countv : COUNT o | GET  count | DATAV ; 
	ratiov : FCONT lint | SIZE l  
		| RATIO ratiov WHITESPACE ratiov 
		| OCONT oratio | GET ratio| countv | DATAV ;	
	intv : AVG lint | AVG oint | ratiov  |GET intt | DATAV ;  
	ordv : MAX lord | MIN lord |  MAX oord  | MIN oord |  GET ordinal | intv;  	
	nomv : ordv | GET nom | TOPOV;
	qv : GET  q | nomv ;
	sv : REIFY l | GET  s | MERGE s ;
	lv : GET l ;		
	ov : GET  o | DATAOBJV ;
	
	
	
	// R rules	
	l : DEIFY sv | PI1  lint  | PI1  lord  | PI1  lnom | PI1  lq | PI1 lratio |  PI1 linto | PI1 lnomo ;	//First apply the most specific function
	s : PI1  sint  | PI1  sord  | PI1  snom | PI1  lq | PI2 os ;	//First apply the most specific function
	o : PI1  os  | PI1  oratio  |  PI1  oint  |  PI1  oord  | PI1  onom| PI1  oq | PI1 onomo |PI2 onomo;
	count : PI2 ocount ;   
	ratio : PI2 oratio | PI2 lratio | count;
	intt : PI1 ints | PI2 oint |  PI2 lint |ratio ;	
	ordinal : PI1  ords | intt ;
	nom : PI1 noms | ordinal ;
	q : PI1  qs | nom ;
	
	// RR rules	
	sint : DATAPM ;
	snom : DATAAMOUNT | sint ;	
	sord : sint ;	
	sq : snom ;
	
	ords : DATACONTOUR ;
	ints : DATACONTOURLINE ; 
	noms : ords ; 
	qs : noms ;	
	
	os : SIGMAE2 os WHITESPACE ov | BOWTIE os WHITESPACE o | DATAOBJS ;	
	ocount : SIGMAE2 ocount WHITESPACE ov | BOWTIE ocount WHITESPACE o | GROUPBYSUM ocounto | DATAOBJCOUNT ;			
	oratio :BOWTIE oratio WHITESPACE o | GROUPBYAVG oratioo | GROUPBYAVG lratioo | DATAOBJQ | ocount ; 
	oint : SIGMASE2 oint WHITESPACE intv|  BOWTIE oint WHITESPACE o  | GROUPBYAVG ointo | GROUPBYAVG linto | oratio	;
	oord : SIGMASE2 oord WHITESPACE ordv |  BOWTIE oord WHITESPACE o  | groupbyaggord oordo |  oint ;
	onom : oord ;
	oq : SIGMAE2 oq WHITESPACE qv |  BOWTIE oq WHITESPACE o  | onom;
	
		
	lratio : DATAFIELD ;		
	lint : INTERPOL sint WHITESPACE l | SIGMASE2 lint WHITESPACE intv|  BOWTIE lint WHITESPACE l   | GROUPBYAVG lintl | lratio   ;
	lord : SIGMASE2 lord WHITESPACE ordv |  BOWTIE lord WHITESPACE l   | groupbyaggord lordl | lint ;
	lnom : lord ; 
	lq : SIGMAE2 lq WHITESPACE qv | BOWTIE lq WHITESPACE l  |lnom;		
	
	
	//RRR rules
	ocounto : BOWTIESTAR onomo WHITESPACE ocount ;
	oratioo : ODIST os WHITESPACE os  |NDIST o WHITESPACE o WHITESPACE oratioo | BOWTIESTAR onomo WHITESPACE oratio ;		
	ointo : BOWTIESTAR onomo WHITESPACE oint  | oratioo ;	
	oordo :  SIGMASE2 oordo WHITESPACE ordv  |  ointo  ;
	onomo : OTOPO os WHITESPACE os  | SIGMAE2 onomo WHITESPACE nomv   |  oordo 	;
	
	lratioo : LODIST l WHITESPACE o | BOWTIESTAR lnomo WHITESPACE lratio ;
	linto : BOWTIESTAR lnomo WHITESPACE lint | lratioo ;	
	lnomo : LOTOPO l WHITESPACE  os | SIGMAE2 lnomo WHITESPACE nomv  ;
	
	lratiol : LDIST l WHITESPACE l | BOWTIESTAR lnoml WHITESPACE lratio;
	lintl : BOWTIESTAR lnoml WHITESPACE lint  | lratiol ;
	lordl :  SIGMASE2 lordl WHITESPACE ordv  | lintl ; 	
	lnoml :  SIGMAE2 lnoml WHITESPACE nomv |lbooll |lordl; 	
	lbooll : LVIS l WHITESPACE l WHITESPACE oint  | SIGMAE2 lbooll WHITESPACE BOOLV ; 	
	
		
	
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
	COUNT : 'count ';
	REIFY : 'reify ' ;
	DEIFY : 'deify ';
	GET : 'get ' ;
	MERGE : 'merge ';
	FCONT :  'fcont ' ;
	OCONT :  'ocont ' ;
	SIZE : 'size ';
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
	DATAOBJV : 'object ' KEYWORD ;
	DATACONTOURLINE :  'contourline ' KEYWORD  ;
	DATAOBJCOUNT :  'objectcounts ' KEYWORD  ;
	DATAFIELD :  'field ' KEYWORD ;	
	TOPOV : 'in' ;
	BOOLV : 'true'| 'false';
	
	DATAV : [0-9]+ ;     
    WHITESPACE : ' ';	
	KEYWORD : ('a'..'z' | 'A'..'Z' | '-' | '_')+ ; // used for naming data
	WS  : [ \t\r\n]+ -> skip ;
	