package persistence;
import java.io.IOException;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import model.entity.*;

public class JSonFileReader {
	
	public static Show show = new Show();
	public static ArrayList<Episode> episodes= new ArrayList<Episode>();
	static int counter = 0;
	public static void parseJSON(JsonParser parser) throws JsonParseException,IOException{
		if(counter < 31)
		while(parser.nextToken() != JsonToken.END_OBJECT) {
			if(counter > 31) {
				break;
			}
			String name = parser.getCurrentName();
			if("name".equals(name)) {
				parser.nextToken();
				if(parser.getText().equals("United States") || parser.getText().equals("Adult Swim")) {
				}else if(parser.getText().equals("Rick and Morty")) {
					show.setName(parser.getText());
				}else {
					episodes.add(new Episode(parser.getText()));
					counter ++;
				}
			}else if ("country".equals(name)) {
				parseJSON(parser);
			}
			else if("summary".equals(name)) {
				parser.nextToken();
				if(parser.getText().equals("<p>Rick is a mentally gifted, but sociopathic and alcoholic scientist and a grandfather to Morty; an awkward, impressionable, and somewhat spineless teenage boy. Rick moves into the family home of Morty, where he immediately becomes a bad influence.</p>")) {
					show.setSummary(parser.getText());
				}else {
					Episode e = episodes.get(episodes.size()-1);
					e.setSummary(parser.getText());
					episodes.set(episodes.size()-1,e);
				}
			}
			else if("genres".equals(name)) {
				parser.nextToken();
				while(parser.nextToken() != JsonToken.END_ARRAY) {
					show.addGenre(parser.getText());
				}
			}else if("schedule".equals(name)) {
				parseJSON(parser);
			}else if("rating".equals(name)) {
				parseJSON(parser);
			}else if("network".equals(name)) {
				parseJSON(parser);
			}else if("externals".equals(name)) {
				parseJSON(parser);
			}else if("image".equals(name)) {
				parseJSON(parser);
			}else if("_links".equals(name)) {
				//parseJSON(parser);
			}else if("self".equals(name)) {
				parseJSON(parser);
			}
			else if("previousepisode".equals(name)) {
				parseJSON(parser);
			}
			else if("_embedded".equals(name)) {
				parseJSON(parser);
			}else if("episodes".equals(name)) {
				parser.nextToken();
				//parseJSON(parser);
			}
			else if("season".equals(name)) {
					parser.nextToken();
					episodes.get(episodes.size()-1).setSeason(parser.getShortValue());
			}else if("number".equals(name)) {
				parser.nextToken();
				episodes.get(episodes.size()-1).setNumber(parser.getShortValue());;
			}
			show.setEpisodes(episodes);
		}
	}
}
