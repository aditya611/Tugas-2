package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    EditText editTextCode;
    EditText editTextNewPassword;
    EditText editTextConfirmPassword;
    // Deklarasi EditText


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        editTextCode = findViewById(R.id.edt_txt_code);
        editTextNewPassword = findViewById(R.id.edt_new_password);
        editTextConfirmPassword = findViewById(R.id.edt_confirm_password);
        // Binding EditText

    }

    public void postChangePassword(View view) {
        // Validasi kosong
        if (TextUtils.isEmpty(editTextCode.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Code tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else if (TextUtils.isEmpty(editTextNewPassword.getText().toString().trim()) &&
                TextUtils.isEmpty(editTextConfirmPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "New Password dan Confirm Password tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(editTextNewPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "New Password tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
            }
            else if (TextUtils.isEmpty(editTextConfirmPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Confirm Password tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);
        }
    }
}
