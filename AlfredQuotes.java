import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ". Lovely to see you.";
    }

	// NINJA BONUS
	public String guestGreeting(String name, String dayPeriod){
        String greeting = "";

		if ("morning".equalsIgnoreCase(dayPeriod)) {
			greeting = "Good morning, " + name + ". Lovely to see you.";
		} else if ("afternoon".equalsIgnoreCase(dayPeriod)) {
			greeting = "Good afternoon, " + name + ". Nice to have you here.";
		} else if ("evening".equalsIgnoreCase(dayPeriod)) {
			greeting = "Good evening, " + name + ". Welcome!";
		} else {
			greeting = "Hello, " + name + ". How are you?";
		}

		return greeting;
	}
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
		Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
			// Convert the conversation to lowercase for case-insensitive matching
		String lowerConversation = conversation.toLowerCase();
		
		// Check if "alexis" appears in the conversation
		if (lowerConversation.contains("alexis")) {
			// If "alexis" is found, return a snarky response
			return "Right away, sir. She certainly isn't sophisticated enough for that.";
		} else if (lowerConversation.contains("alfred")) {
			// If "alfred" is found, return an obliging response
			return "At your service. As you wish, naturally.";
		} else {
			// If neither name is found, return a default response
			return "Right. And with that, I shall retire.";
		}
    }
    
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}

