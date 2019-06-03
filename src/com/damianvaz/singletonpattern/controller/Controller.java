package com.damianvaz.singletonpattern.controller;

import com.damianvaz.singletonpattern.model.Model;
import com.damianvaz.singletonpattern.view.LoginFormEvent;
import com.damianvaz.singletonpattern.view.LoginListener;
import com.damianvaz.singletonpattern.view.View;

public class Controller implements LoginListener
{
	private View view;
	private Model model;

	public Controller(View view, Model model)
	{
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event)
	{
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

	}

}
