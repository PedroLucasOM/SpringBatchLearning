package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;

public class ClientProcessor implements ItemProcessor<Client, Client> {
    @Override
    public Client process(Client client) throws Exception {
        System.out.println("Running client processor");
        return client;
    }
}
