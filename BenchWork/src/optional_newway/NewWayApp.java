package optional_newway;

import java.util.Optional;
import java.util.Scanner;

import optional_oldway.Friend;
import optional_oldway.FriendFinderService;

public class NewWayApp {

    public static void main(String[] args) {

        FriendFinderService friendFinderService = new FriendFinderService();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Find friend:");
        Optional<Friend> friend = Optional.ofNullable(friendFinderService.findFriend(userInput.nextLine()));
        friend.ifPresentOrElse(System.out::println, () -> System.out.println("Not found."));

    }
}
