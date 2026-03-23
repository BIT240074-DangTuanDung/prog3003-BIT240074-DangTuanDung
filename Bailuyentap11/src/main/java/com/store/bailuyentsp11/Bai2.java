package com.store.bailuyentsp11;

public class Bai2 {

    // Interface
    interface MessageService {
        void sendMessage(String message);
    }

    // EmailService
    static class EmailService implements MessageService {
        @Override
        public void sendMessage(String message) {
            System.out.println("Gui Email: " + message);
        }
    }

    // SMSService
    static class SMSService implements MessageService {
        @Override
        public void sendMessage(String message) {
            System.out.println("Gui SMS: " + message);
        }
    }

    // Notification (Setter Injection)
    static class Notification {
        private MessageService messageService;

        // Setter Injection
        public void setMessageService(MessageService messageService) {
            this.messageService = messageService;
        }

        public void notifyUser(String message) {
            if (messageService != null) {
                messageService.sendMessage(message);
            } else {
                System.out.println("Chua co dich vu gui tin!");
            }
        }
    }

    // Main
    public static void main(String[] args) {
        Notification notification = new Notification();

        // Gửi qua Email
        notification.setMessageService(new EmailService());
        notification.notifyUser("Thong bao qua Email");

        // Gửi qua SMS
        notification.setMessageService(new SMSService());
        notification.notifyUser("Thong bao qua SMS");
    }
}