package anhchxph24786.edu.fpt.vn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String strUserName, strPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("QUẢN LÝ SÁCH");
        setContentView(R.layout.activity_main);
        if (checkLoginShap()<0){
            Intent i = new Intent(MainActivity.this,Login.class);
            startActivity(i);
        }
    }
    public int checkLoginShap(){
        SharedPreferences pref = getSharedPreferences("USER_FILE",MODE_PRIVATE);
        boolean chk = pref.getBoolean("REMEMBER",false);
        if (chk){
            strUserName = pref.getString("USERNAME","");
            strPassword = pref.getString("PASSWORD","");
            return 1;
        }
        return -1;
    }
    public void viewNguoiDung(View v){
        Intent intent = new Intent(MainActivity.this,ListNguoiDungActivity.class);
        startActivity(intent);
    }

    public void viewTheLoai(View v){
        Intent intent = new Intent(MainActivity.this,ListTheLoaiActivity.class);
        startActivity(intent);
    }

    public void viewListBookActivity(View v){
        Intent intent = new Intent(MainActivity.this,ListBookActivity.class);
        startActivity(intent);
    }
    public void ViewListHoaDonActivity(View v){
        Intent intent = new Intent(MainActivity.this,ListHoaDonActivity.class);
        startActivity(intent);
    }
    public void ViewTopSach(View v){
        Intent intent = new Intent(MainActivity.this,LuotSachBanChayActivity.class);
        startActivity(intent);
    }
    public void ViewThongKeActivity(View v){
        Intent intent = new Intent(MainActivity.this,ThongKeDoanhThuActivity.class);
        startActivity(intent);
    }
}