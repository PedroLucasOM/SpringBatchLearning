package com.springbatch.SpringBatchLearning.reader;

import com.springbatch.SpringBatchLearning.model.Client;
import com.springbatch.SpringBatchLearning.model.Transaction;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.*;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.core.io.Resource;

@RequiredArgsConstructor
public class MultipleLineFileReader implements ItemStreamReader<Object>, ResourceAwareItemReaderItemStream<Object> {


    private Object currentObject;

    @NonNull
    private FlatFileItemReader<Object> delegate;

    @Override
    public Object read() throws Exception {
        if (currentObject == null) {
            currentObject = delegate.read();
        }

        Client client = (Client) currentObject;
        currentObject = null;

        if (client != null) {
            while (peek() instanceof Transaction) {
                client.getTransactionList().add((Transaction) currentObject);
            }
        }

        return client;
    }

    private Object peek() throws Exception {
        currentObject = delegate.read();
        return currentObject;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        delegate.open(executionContext);
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        delegate.update(executionContext);
    }

    @Override
    public void close() throws ItemStreamException {
        delegate.close();
    }

    @Override
    public void setResource(Resource resource) {
        delegate.setResource(resource);
    }
}
