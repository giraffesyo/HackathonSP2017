public class Data
{
	private static String basedString;
	private static String id;
	private String avatar;
	private String level;
	private String win_rate;
	private String objective_kills_most_in_game;
	private String medals_bronze;
	private String medals_silver;
	private String medals_gold;
	
	public Data(String input)
	{
		basedString = input;
		avatar = extract("avatar");
		level = extract("level");
		win_rate = extract("win_rate")+"%";
		objective_kills_most_in_game = extract("objective_kills_most_in_game");
		medals_bronze = extract("medals_bronze");
		medals_silver = extract("medals_silver");
		medals_gold = extract("medals_gold");
		
	}
	public String extract(String input)
	{
		int indexStart = basedString.indexOf(input);
		int indexEnd = indexStart+(input.length());
		int addedIndex = 3;
		String value = "";
		while(basedString.charAt(indexEnd+addedIndex)!=',')
		{
			value +=basedString.charAt(indexEnd+addedIndex);
			addedIndex++;
		}
		return value;
	}

	public static String getBasedString() {
		return basedString;
	}

	public static String getId() {
		return id;
	}

	public String getAvatar() {
		return avatar;
	}

	public String getLevel() {
		return level;
	}

	public String getWin_rate() {
		return win_rate;
	}

	public String getObjective_kills_most_in_game() {
		return objective_kills_most_in_game;
	}

	public String getMedals_bronze() {
		return medals_bronze;
	}

	public String getMedals_silver() {
		return medals_silver;
	}

	public String getMedals_gold() {
		return medals_gold;
	}

}
