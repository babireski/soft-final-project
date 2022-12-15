public class Account
{
	private String name;
	private String email;
	private String password;
	
	public Account(String name, String email, String password)
	{
		this.name = name;
		this.email = email;
		this.password = password;
	}

	/* Getters */

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPassword()
	{
		return password;
	}

	/* Setters */

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	/* Others */

	public void evaluatePlace()
	{

	}

	public void reportInaccessibility()
	{

	}

	public void deleteAccount()
	{

	}
}
