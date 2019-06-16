class ErrrorMsg{
String msgs[]={
"output error",
"input error",
"disk full";
"index out-of-bounds"
};
String getErrorMsg(int i){
if(i>=0 & i<msg.length)
return msgs[i];
else
return "invalid error code";
}
}
class ErrMsg{
public static void main(String args[]){
ErrorMsg err=new ErrorMsg();
System.out.println(err.getErrorMsg(2));
System.out.println(err.getErrorMsg(19));
}
}