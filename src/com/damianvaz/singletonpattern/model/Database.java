package com.damianvaz.singletonpattern.model;


public class Database
{

	private static Database instance = new Database();

	private Database()
	{

	}

	public static Database getInstance()
	{
		return instance;
	}

	/* Lazy instantiation, will only create the object Database when called this method,
	 *  good for accelerating loading from program, but not thread safe
	 * private static Database instanceOld;
	 * 
	 * public static Database getInstanceOld() { if(instanceOld == null) {
	 * instanceOld = new Database(); }
	 * 
	 * return instanceOld; }
	 */

	/*
	 * Add whatever methods you like to your singleton class.
	 */
	public void connect()
	{
		System.out.println("Connected to Database");
	}

	public void disconnect()
	{
		System.out.println("Disconnected from Database");
	}

}
