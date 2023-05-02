package repository;

import entity.EmvMessage;

public class EmvRepositoryImpl implements EmvRepository{

    public EmvMessage[] data = new EmvMessage[21];

    @Override
    public EmvMessage[] getAll() {
        return data;
    }

    @Override
    public void add(EmvMessage emvMessage) {

    }

    @Override
    public void remove(Integer number) {

    }
}
