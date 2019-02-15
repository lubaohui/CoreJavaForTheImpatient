package com.java.impatient.ch04.sec02;

import java.util.ArrayList;

/**
 * 
 * @ClassName Message
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-07 17:07
 * @Version 1.0
 */
public final class Message {
    private String sender;
    private ArrayList<String> recipients;
    private String text;

    /**
     * 
     * @param sender
     * @param text
     */
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }

    public void addRecipient(String recipient) { 
        recipients.add(recipient);
    };

    @Override
    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipients 
                = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients; 
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}