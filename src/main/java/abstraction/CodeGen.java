package abstraction;

public class CodeGen
{
    private String op, src1, src2, dest;

    public CodeGen(String op, String src1, String src2, String dest)
    {
        this.op = op;
        this.src1 = src1;
        this.src2 = src2;
        this.dest = dest;
    }

    public String getOp()
    {
        return op;
    }

    public String getSrc1()
    {
        return src1;
    }

    public String getSrc2()
    {
        return src2;
    }

    public String getDest()
    {
        return dest;
    }
}
