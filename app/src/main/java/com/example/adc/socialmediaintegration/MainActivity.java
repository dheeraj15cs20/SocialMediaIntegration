package com.example.adc.socialmediaintegration;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

import javax.security.auth.callback.Callback;

public class MainActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private TextView textView;
    private AccessTokenTracker accessTokenTracker;
    private ProfileTracker profileTracker;
    LoginButton loginButton;
    ImageView imageView;
    FacebookCallback<LoginResult> callback;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        private static final String EMAIL = "email";

        loginButton = (LoginButton) findViewById(R.id.login_button);
        textView =(TextView)findViewById(R.id.textView);
        imageView=(ImageView) findViewById(R.id.imageView);
        loginButton.setReadPermissions(Arrays.asList(EMAIL));
        FacebookSdk.sdkInitialize(getApplicationContext());
        // If you are using in a fragment, call loginButton.setFragment(this);

        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });

    }

    private void findViewById(int login_button) {
    }

    private void setContentView(int activity_main) {
    }

    public Object getApplicationContext() {
        return applicationContext;
    }
}