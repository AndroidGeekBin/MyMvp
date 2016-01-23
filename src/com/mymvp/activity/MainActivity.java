package com.mymvp.activity;

import android.R.bool;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mymvp.R;
import com.mymvp.presenter.userPresenter;
import com.mymvp.view.userView;

public class MainActivity extends Activity implements OnClickListener,userView {
	private EditText input,passwords;
	private userPresenter presenter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		presenter = new userPresenter(this);
		input = (EditText) findViewById(R.id.name);
		passwords = (EditText) findViewById(R.id.password);
		findViewById(R.id.login).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
			switch (v.getId()) {
			case R.id.login:
			boolean bool =	presenter.login(getName(), getPassword());
			if(bool)
				Toast.makeText(this, "登陆成功",Toast.LENGTH_SHORT).show();
			else
				Toast.makeText(this, "登陆失败",Toast.LENGTH_SHORT).show();
				break;

			}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return input.getText().toString();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passwords.getText().toString();
	}

	@Override
	public void setName(String name) {
			
		input.setText(name);
	}

	@Override
	public void setPassword(String password) {
		
		passwords.setText(password);
	}

	
}
