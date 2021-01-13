	grammar TransformationAlgebraTyped;
	
	/*
    * This grammar can be used to parse typed strings of the Algebra of core concept transformation. Each string is a representation of a GIS workflow. It consists of a (left to right parsed) sequence of function or concept types. Function types can be be of different arity, and are supposed to be applied to the types to their right depending on their arity. Bracketed functions can become concepts, and thus inputs of functions, too. Further concepts are (unary, binary or ternary) relations and values. We use prefix notation: -: function prefix, * relation prefix.
	*
	* Example strings ():
	*  
	*  	-: Nom -: Nom Nom //function from Nom to some function from Nom to Nom (binary function)
	* 	-: Ord -: O -: S * Nom O // ternary function that outputs a binary relation
	*  	* O Nom O	//relation ONomO
	* 	-: NomV * Nom S * O Nom //function from NomV to relation NomS, plus some relation ONom
	*   -: Nom * Nom S Nom
	* 	-: (-: Nom NomV) * Nom S //This function type takes a function as input and outputs a binary relation
	*	workflow example: -: Nom -: O * O Nom Nom O
	*/
	
     /*
     * Parser Rules
     */
	//Start rules: 
    	start : fa;				
		//t | (t WHITESPACE)+ t ; 
		//t : fc | c ;		
	
	//Function Types		
		fh : IMPLIED WHITESPACE c ;
		fc1 :  fh WHITESPACE c ; 	//unary functions
		fc2 :	fh WHITESPACE fc1; 	//binary functions
		fc3	:	fh WHITESPACE fc2; 	//ternary functions	
		fc : fc1 | fc2 | fc3;
	
	//application rules for functions
		fa 		: 	fa0 | fa1 | fa2 | fa3;
		fa0		:	c ;
		fa1		: 	fc1 WHITESPACE fa;
		fa2		:	fc2 WHITESPACE fa WHITESPACE fa;
		fa3		: 	fc2 WHITESPACE fa WHITESPACE fa WHITESPACE fa;	
		
    	
	//Concept types (including hierarchy):
		c 		:  v | r | rr | rrr | bfc;
		
		bfc : '(' fc ')' ; //bracketed function type (used as concept, i.e. as input to a function)
		
		v		: nomv | OV | LV | SV ;
		nomv 	: NOMV | ordv | BOOLV ;
		ordv	: ORDV | itvv ;
		itvv	: ITVV | ratv ;
		ratv	: RATV | EV | IV | countv ;
		countv	: COUNTV;
		
		r		: nom | O | L | S ;
		nom 	: NOM | ord | BOOL ;
		ord		: ORD | itv ;
		itv		: ITV | rat ;
		rat		: RAT | E | I | count ;
		count	: COUNT;		
		
		rr		: REL WHITESPACE r WHITESPACE r ;
		
		rrr 	: REL WHITESPACE r WHITESPACE rr;
	
	
		
		
		
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