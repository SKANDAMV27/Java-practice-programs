class stringBuffer{
    public static void main(String[] args)
    {
        StringBuffer sb= new StringBuffer("Skanda");
        sb.append(" m v");
        //sb.deleteCharAt(2);
        sb.insert(0,"java ");
        System.out.println(sb);
    }
}

///StringBuffer allows modification without creating new objects, making it more efficient for operations that involve frequent string modifications.