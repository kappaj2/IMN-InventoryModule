package za.co.tman.inventory.service.messaging;

public interface IMMessageProcessor {
    
    void processMessageReceived(InterModulePubSubMessage interModulePubSubMessage);

}
