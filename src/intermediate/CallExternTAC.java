package intermediate;

public class CallExternTAC extends ThreeAddressCode {
    public String place;
    public Access param1, param2;

    public CallExternTAC(String place, Access param1, AssignableAccess dst) {
        this.param1 = param1;
        this.param2 = null;
        this.op1 = null;
        this.op2 = null;
        this.dst = (Access)dst;
        this.place = place;
    }

    public String toString() {
        String s = "call extern " + place.toString() + "(";
        if (param1 != null)
            s += param1.toString();
        if (param2 != null)
            s += ", " + param2.toString();
        s += ")";
        if (dst == null)
            return s;
        else
            return dst.toString() + " := " + s;
    }
}
