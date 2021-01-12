	grammar TransformationAlgebraTyped;
	
	/*
    * This grammar can be used to parse strings of the Algebra of core concept transformation. Each string is an abstract representation of a GIS workflow.
	*
	* Example strings:
	*  
	*  -: Nom -: Nom Nom //function from Nom to some function from Nom to Nom
	*  * O Nom O	//relation ONomO
	* 	-: NomV * Nom S * O Nom //function from NomV to relation NomS, plus some relation ONom
	*   -: Nom * Nom S Nom
	* 	-: (-: Nom NomV) * Nom S //This function type takes a function as input
	*/
	
     /*
     * Parser Rules
     */
	//Start rules: 
    	start  : t | (t WHITESPACE)+ t ; 
		t : fc | c ;		 
		
	//Function Types				
		ft : t;
		fc : IMPLIED WHITESPACE c WHITESPACE ft ; 	
		bfc : '(' fc ')' ; //bracketed function type (used as concept, and thus as input to a function)
    	
	//Concept types:
	c 	:  v | r | rr | rrr | bfc;
	v		: NOMV | ORDV | ITVV | RATV | COUNTV | OV | LV | SV | BOOLV ;
	r 		: NOM | ORD | ITV | RAT | COUNT | O | L | S | BOOL ;	
	rr		: REL WHITESPACE r WHITESPACE r ;
	rrr 	: REL WHITESPACE r WHITESPACE rr;
	
	
	//application rules (implication elimination)
	
	
		
	//LEXER rules	
	
	NOM		: 'Nom';
	ORD		: 'Ord';
	ITV		: 'Itv';
	RAT		: 'Ratio';
	COUNT	: 'Count' ;
	E		: 'Ext';
	I		: 'Int' ;
	O 		: 'O' ;
	L 		: 'L';
	S 		: 'S';
	BOOL	: 'Bool' ;
	
	NOMV	: 'NomV';
	ORDV	: 'OrdV';
	ITVV	: 'ItvV';
	RATV	: 'RatioV';
	COUNTV	: 'CountV' ;
	EV		: 'ExtV';
	IV		: 'IntV' ;
	OV 		: 'OV' ;
	LV 		: 'LV';
	SV 		: 'SV';
	BOOLV	: 'BoolV' ;
	
	REL 	: '*';	
	
	IMPLIED : '-:';
	
	
	//Basic lexer rules
	DATAV : [0-9]+ ;     
    WHITESPACE : ' ';	
	KEYWORD : ('a'..'z' | 'A'..'Z' | '-' | '_' | ':' | [0-9] )+ ; // used for naming data
	WS  : [ \t\r\n]+ -> skip ;	