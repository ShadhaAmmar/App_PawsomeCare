package  com.example.pawsomecare.ui.login;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pawsomecare.MainActivity;
import com.example.pawsomecare.R;
import com.example.pawsomecare.SignUp;
import com.example.pawsomecare.home;
import com.example.pawsomecare.ui.login.LoginViewModel;
import com.example.pawsomecare.ui.login.LoginViewModelFactory;
import com.example.pawsomecare.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private ActivityLoginBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loginViewModel = new ViewModelProvider(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        final EditText usernameEditText = binding.username;
        final EditText passwordEditText = binding.password;
        final Button loginButton = binding.login;
        final ProgressBar loadingProgressBar = binding.loading;
        ((Button) findViewById(R.id.signup)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Sign Up", Toast.LENGTH_SHORT).show();
                Intent signup = new Intent(LoginActivity.this, SignUp.class);
                startActivity(signup);
            }
        });
        ((Button) findViewById(R.id.login)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(LoginActivity.this, com.example.pawsomecare.home.class);
                startActivity(home);
            }
        });


    }
}