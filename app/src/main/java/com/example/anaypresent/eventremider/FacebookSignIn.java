package com.example.anaypresent.eventremider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.login.widget.LoginButton;

/**
 * Created by anaypresent on 26/5/17.
 */

public class FacebookSignIn {
    private LoginButton loginButton;

    public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
    View view = inflater.inflate(R.layout.splash , container , false);
    loginButton = (LoginButton) view.findViewById(R.id.sign_in);
    loginButton.setReadPermissions("email");

return view;

    }


}
