	grammar TransformationAlgebra;
	// Examples:
	 //ratio fcont interpol pointmeasures temperature fcont pi interpol pointmeasures temperature
	 //reify pi sigma<= interpol pointmeasures noise deify get pi sigma= objectregions Utrecht 20
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
		| RATIO  ratiov WHITESPACE ratiov 
		| OCONT oratio | GET ratio| countv | DATAV ;	
	intv : AVG lint | AVG oint | ratiov  |GET int | DATAV ;  
	ordv : MAX lord | MIN lord |  MAX oord  | MIN oord |  GET ord | intv;  	
	//ratiov : countv;
	//intv : ratiov;
	//ordv : intv ;
	nomv : ordv | GET nom ;
	//qv : nomv ;
	qv : GET  q | nomv ;
	sv : REIFY l | GET  s  ;
	//l : DEIFY sv ;
	lv : GET l ;		
	ov : GET  o | DATAN ;
	
	
	
	// R rules
	//ratio : count ;
	//ord : int ;
	//nom : ord ; 
	//q : nom ;
	l : DEIFY sv | PI1  lint  | PI1  lord  | PI1  lnom | PI1  lq ;	//First apply the most specific function
	s : PI1  sint  | PI1  sord  | PI1  snom | PI1  lq;	//First apply the most specific function
	o : PI1  os  | PI1  oratio  |  PI1  oint  |  PI1  oord  | PI1  onom| PI1  oq;
	count : PI2 ocount ;   
	ratio : PI2 oratio | PI2 lratio | count;
	int : PI1 ints | PI2 oint |  PI2 lint |ratio ;	
	ord : PI1  ords | int ;
	nom : PI1 noms | ord ;
	q : PI1  qs | nom ;
	
	// RR rules
	
	//Data rules:
	sint : DATAPM ;
	snom : DATAAMOUNT | sint ;	
	ords : DATACONTOUR ;	
	
	os : DATAOBJS ;
	ints : DATACONTOURLINE ; 
	ocount : DATAOBJCOUNT ;
	lratio : DATAFIELD ;
	
	//Type rules:		
	//ints : ratios ;
	//ords : ints ;
	noms : ords ; 
	qs : noms ;
	oratio :BOWTIE oratio WHITESPACE o | GROUPBY AVG oratioo | DATAOBJQ ; 
	oint : SIGMASE2 oint WHITESPACE intv|  BOWTIE oint WHITESPACE o  | GROUPBY AVG ointo |oratio	;
	oord : SIGMASE2 oord WHITESPACE ordv |  BOWTIE oord WHITESPACE o  | GROUPBY aggord oordo |  oint ;
	onom : oord ;
	oq : SIGMAE2 oq WHITESPACE qv |  BOWTIE oq WHITESPACE o  | onom;
	
		
	//lord : lint ;
	lnom : lord ; 
	//lq : lnom ;
	lint : INTERPOL sint | SIGMASE2 lint WHITESPACE intv|  BOWTIE lint WHITESPACE l   | GROUPBY AVG lintl |   lratio   ;
	lord : SIGMASE2 lord WHITESPACE ordv |  BOWTIE lord WHITESPACE l   | GROUPBY aggord lordl |lint ;
	lq : SIGMAE2 lq WHITESPACE qv | BOWTIE lq WHITESPACE l  |lnom;	
	//sint : sratio ;
	sord : sint ;
	//snom : sord ; 
	sq : snom ;
	
	
	
	
	//RRR rules
	oratioo : ODIST os WHITESPACE os  |NDIST o WHITESPACE o WHITESPACE oratioo ;
	lratiol : LDIST l WHITESPACE l ;
	lratioo : LODIST l WHITESPACE o ;
	onomo : OTOPO os WHITESPACE os  | SIGMAE2 onomo WHITESPACE nomv   |  oordo 	;
	lnomo : LOTOPO l WHITESPACE  os ;	
	
	lintl : BOWTIE lnoml WHITESPACE lint  | lratiol ;
	lordl :  SIGMASE2 lordl WHITESPACE ordv  | lintl ; 	
	lnoml :  SIGMAE2 lnoml WHITESPACE nomv |lbooll |lordl; 	
	lbooll : LVIS l WHITESPACE l WHITESPACE oint  |  
	SIGMAE2 lbooll WHITESPACE BOOLV ; 	
	
	oordo :  SIGMASE2 oordo WHITESPACE ordv  |  ointo  ;	
	ointo : BOWTIE onomo WHITESPACE oint  | oratioo ;		
	
	//Group by		
	agg :  AVG |	aggord   ;
	aggord : MIN |	MAX;
	/*
     	* Lexer Rules
     	*/
	//Functions: 
	BOOLV : 'true '| 'false ';
	AVG : 'average ' ;
	MIN : 'min ' ;
	MAX : 'max ' ;
	REIFY : 'reify ' ;
	DEIFY : 'deify ';
	GET : 'get ' ;
	FCONT :  'fcont ' ;
	OCONT :  'ocont ' ;
	RATIO : 'ratio '  ;
	INTERPOL : 'interpol ' ;
	PI1 : 'pi ' ;
	PI2 : 'pi ' ;
	SIGMAE2 : 'sigma1 '  ; // =
	SIGMASE2 : 'sigma2 '  ; // <=
	BOWTIE : 'bowtie ' ;
	GROUPBY : 'groupby ' ;
	
	ODIST : 'odist ' ;
	LDIST : 'ldist ';
	LODIST : 'lodist ' ;
	OTOPO : 'otopo ' ;
	LOTOPO : 'lotopo ' ;
	NDIST : 'ndist ' ;
	LVIS : 'lvis ' ;
	
	//Data:
	DATAPM : 'pointmeasures' | 'pointmeasures ' KEYWORD ;
	DATAAMOUNT  : 'amountpatches' | 'amountpatches ' KEYWORD ;
  	DATACONTOUR : 'contour' | 'contour'  KEYWORD  ;
	DATAOBJQ :  'objects' | 'objects' KEYWORD  ;
	DATAOBJS : 'objectregions' | 'objectregions' KEYWORD;
	DATACONTOURLINE : 'contourline' | 'contourline ' KEYWORD  ;
	DATAOBJCOUNT : 'objectcounts' | 'objectcounts' KEYWORD  ;
	DATAFIELD : 'field' | 'field' KEYWORD ;
	
	DATAV : '20' ;
	DATAN : 'Utrecht' ;
	
	
	
     //ID     : [0-9]+ ;
    	WHITESPACE : ' ' ;	
	KEYWORD : ('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '_')+ ;
	//WS  : [ \t\r\n]+ -> skip ;
	