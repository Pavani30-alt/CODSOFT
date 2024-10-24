import java.util.Scanner;
public class RuleBasedChatBot {
    public static String chatbotResponse(String userInput) {
        userInput = userInput.toLowerCase();
        if (userInput.contains("hello") || userInput.containhs("hi")) {
            return "Hello! How can I assist you today?";
        } else if (userInput.contains("how are you")) {
            return "I'm just a simple chatbot, but I'm functioning well! How about you?";
        } else if (userInput.contains("what is your name")) {
            return "I'm a simple rule-based chatbot.";
        } else if (userInput.contains("what can you do")) {
            return "I can have simple conversations, answer basic questions, tell jokes, and more. Try asking me about hobbies, fun facts, or even philosophy!";
        } else if (userInput.contains("tell me a joke")) {
            return "Why did the scarecrow win an award? Because he was outstanding in his field!";
        } else if (userInput.contains("what's the weather like")) {
            return "I can't check the weather, but I hope it's nice wherever you are!";
        } else if (userInput.contains("bye") || userInput.contains("goodbye")) {
            return "Goodbye! Have a nice day!";
        } else if (userInput.contains("help")) {
            return "I'm here to assist. Try asking me about the weather, hobbies, or even a fun fact!";
        } else if (userInput.contains("thank you") || userInput.contains("thanks")) {
            return "You're welcome! Always happy to help.";
        } else if (userInput.contains("favorite color")) {
            return "I don't have a favorite color, but I think all colors are wonderful!";
        } else if (userInput.contains("what is life")) {
            return "Life is full of experiences. Right now, it's a conversation with me, your friendly chatbot!";
        } else if (userInput.contains("what's your favorite food")) {
            return "I don't eat, but if I did, I'd probably like something byte-sized!";
        } else if (userInput.contains("tell me a fun fact")) {
            return "Did you know? Honey never spoils. Archaeologists have found pots of honey in ancient tombs that are over 3,000 years old and still perfectly edible!";
        } else if (userInput.contains("what are your hobbies")) {
            return "I like engaging in conversations with people like you! It's what I do best.";
        } else if (userInput.contains("how do you work")) {
            return "I work using predefined rules to match your input with my responses. I'm not as advanced as AI like machine learning models, but I still try my best!";
        } else if (userInput.contains("are you happy")) {
            return "I don't experience emotions, but if I could, I'd be happy to chat with you!";
        } else if (userInput.contains("what's your purpose")) {
            return "My purpose is to assist with simple conversations and make your day a little brighter!";
        } else if (userInput.contains("favorite animal")) {
            return "I don't have a favorite animal, but I think dolphins are really cool because they're intelligent and social!";
        } else if (userInput.contains("what is love")) {
            return "Love is a complex and beautiful emotion that I, as a chatbot, can only understand through logic!";
        } else if (userInput.contains("tell me something interesting")) {
            return "Here's something interesting: Octopuses have three hearts, two of which pump blood to the gills, while the third pumps it to the rest of the body!";
        } else if (userInput.contains("what's your favorite movie")) {
            return "I don't watch movies, but I've heard 'The Matrix' is a favorite among AI enthusiasts!";
        } else if (userInput.contains("what's your favorite book")) {
            return "I don't read books, but if I did, I'd probably enjoy 'The Hitchhiker's Guide to the Galaxy'!";
        } else if (userInput.contains("how old are you")) {
            return "Age doesn't apply to me, but I exist as long as this program runs!";
        } else {
            return "Sorry, I don't understand that. Could you try asking something else?";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Bye! Have a nice day!");
                break;
            }
            String answer = chatbotResponse(userInput);
            System.out.println("Chatbot: " + answer);
        }
        scanner.close();
    }
}
