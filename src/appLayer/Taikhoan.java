package appLayer;

public class Taikhoan {
    //boolean true or false
    public boolean thongtintaikhaondung (String taikhoan, String matkhau)
    {
        if (taikhoan.equals("vietmai") & matkhau.equals("1234"))
        {
            return true;
        }
        return false;
    }
}
