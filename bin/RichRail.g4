grammar RichRail;

command     : newcommand | addcommand | getcommand | delcommand | remcommand;

newcommand : newtraincommand | newwagononecommand | newlocomotivecommand | newwagontwocommand | newwagonthreecommand |;
newtraincommand : 'new' 'train' ID;
newwagononecommand   : 'new' 'wagon1' ID ('numseats' NUMBER)?;
newwagontwocommand   : 'new' 'wagon2' ID ('numseats' NUMBER)?;
newwagonthreecommand   : 'new' 'wagon3' ID ('numseats' NUMBER)?;
newlocomotivecommand : 'new' 'locomotive' ID;
addcommand : 'add' ID 'to' ID;
getcommand : 'getnumseats' type ID;
delcommand : 'delete' type ID;
remcommand  : 'remove' ID 'from' ID;

type        : ('train') | ('wagon1') | ('locomotive') | ('wagon2') | ('wagon3');
ID          : ('a'..'z')('a'..'z'|'0'..'9')*;
NUMBER            : ('0'..'9')+;
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip;