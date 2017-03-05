public class Data {
    private String rawData;

    private String avatar;
    private String level;
    private String win_rate;
    private String objective_kills_most_in_game;
    private String medals_bronze;
    private String medals_silver;
    private String medals_gold;
    private boolean notFound;

    Data(String input) {
        rawData = input;
        avatar = extract("avatar");
        level = extract("level");
        win_rate = extract("win_rate") + "%";
        objective_kills_most_in_game = extract("objective_kills_most_in_game");
        medals_bronze = extract("medals_bronze");
        medals_silver = extract("medals_silver");
        medals_gold = extract("medals_gold");

    }

    String extract(String input) {
        try {
            int indexStart = rawData.indexOf(input);
            int indexEnd = indexStart + (input.length());
            int addedIndex = 3;
            String value = "";
            while (rawData.charAt(indexEnd + addedIndex) != ',') {
                value += rawData.charAt(indexEnd + addedIndex);
                addedIndex++;
            }
            return value;
        } catch (StringIndexOutOfBoundsException e) {
            notFound = true;
            return null;
        }
    }

    public boolean isNotFound() {
        return notFound;
    }

    String getAvatar() {
        return avatar;
    }

    String getLevel() {
        return level;
    }

    String getWin_rate() {
        return win_rate;
    }

    String getObjective_kills_most_in_game() {
        return objective_kills_most_in_game;
    }

    String getMedals_bronze() {
        return medals_bronze;
    }

    String getMedals_silver() {
        return medals_silver;
    }

    String getMedals_gold() {
        return medals_gold;
    }

}
