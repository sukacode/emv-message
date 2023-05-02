package repository;

import entity.EmvMessage;

public interface EmvRepository {
    EmvMessage[] getAll();

    void add(EmvMessage emvMessage);

    void remove(Integer number);
}
