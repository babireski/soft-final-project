import java.util.*;
import org.javatuples.*;

public class Stretch
{
	private String name;
	private float length;
	private Pair<Coordinate, Coordinate> coordinates;
	private List<Inaccessibility> inaccessibilities;

	public Stretch(String name, float length, Pair<Coordinate, Coordinate> coordinates, List<Inaccessibility> inaccessibilities)
	{
		this.name = name;
		this.length = length;
		this.coordinates = coordinates;
		this.inaccessibilities = inaccessibilities;
	}

	/* Getters */

	public String getName()
	{
		return name;
	}
	
	public float getLength()
	{
		return length;
	}

	public Pair<Coordinate, Coordinate> getCoordinates()
	{
		return coordinates;
	}
	
	public List<Inaccessibility> getInaccessibilities()
	{
		return inaccessibilities;
	}

	/* Setters */
	
	public void setNome(String name)
	{
		this.name = name;
	}

	public void setLength(float length)
	{
		this.length = length;
	}

	public void setCoordinates(Pair<Coordinate, Coordinate> coordinates)
	{
		this.coordinates = coordinates;
	}

	public void setInaccessibilities(List<Inaccessibility> inaccessibilities)
	{
		this.inaccessibilities = inaccessibilities;
	}

	/* Others */

	public void addInaccessibility(Inaccessibility inaccessibility)
	{
		inaccessibilities.add(inaccessibility);
	}

	public List<Stretch> getRoute(Coordinate departure, Coordinate destination)
	{
		List<Stretch> route = new ArrayList<Stretch>();

		return route;
	}
}