package com.damianvaz.singletonpattern;

import javax.swing.SwingUtilities;

import com.damianvaz.singletonpattern.controller.Controller;
import com.damianvaz.singletonpattern.model.Model;
import com.damianvaz.singletonpattern.view.View;

public class Application
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				runApp();
			}

		});
	}

	public static void runApp()
	{
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);

		view.setLoginListener(controller);
	}

}
