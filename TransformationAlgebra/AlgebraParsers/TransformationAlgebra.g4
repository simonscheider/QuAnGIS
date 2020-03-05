	grammar TransformationAlgebra;

	 //ratio fcont interpol pointmeasures temperature fcont sigma1 interpol pointmeasures temperature
	 //
     /*
     * Parser Rules
     */
	//Start rule: 
    start  : (l | ratiov | lq | sq);
	
	//Functional rules:
	ratiov : FCONT lint 
			| FCONT l 
			| RATIO  ratiov WHITESPACE ratiov ;	
	lint : INTERPOL sint ;	
	l : SIGMA1  lint  | SIGMA1  lord  | SIGMA1  lnom | SIGMA1  lq ;	//First apply the most specific function
	
	//Type rules:
	//int : ratio ;
	//ord : int ;
	//nom : ord ; 
	//q : nom ;
	
	//lint : lratio ;
	lord : lint ;
	lnom : lord ; 
	lq : lnom ;
	
	//sint : sratio ;
	sord : sint ;
	snom : sord ; 
	sq : snom ;
	
	//Data rules:
	sint : DATAPM | sratio ;
	sratio : DATAPAMOUNT ;	
	    
	/*
     * Lexer Rules
     */
	//Functions: 
	FCONT :  'fcont ' ;
	RATIO : 'ratio '  ;
	INTERPOL : 'interpol ' ;
	SIGMA1 : 'sigma1 '  ;
	
	//Data:
	DATAPM : 'pointmeasures' | 'pointmeasures ' KEYWORD ;
	DATAPAMOUNT  : 'amountpatches' | 'amountpatches ' KEYWORD ;
    //ID     : [0-9]+ ;
	
    WHITESPACE : ' ' ;	
	KEYWORD : ('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '_')+ ;
	//WS  : [ \t\r\n]+ -> skip ;
	