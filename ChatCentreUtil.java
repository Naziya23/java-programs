class ChatCentreUtil{
	public static void main(String a[]){
		ChatCentre centre = new ChatCentre();
		centre.items[0] = "Pani Puri";
		centre.items[1] = "Kachori";
		centre.items[2] = "Samosa";
		centre.items[3] = "Sandwich";
		centre.items[4] = "PavBhaji";
		ChatCentre centre1 = new ChatCentre("Sai chats", "KLE ground", centre.items);
		ChatCentre centre2 = new ChatCentre(45, "Azar", true);
		centre1.displayChatCentre();
		centre2.displayChatCentre();
		centre1.getItems();
	}
}