package service;

import entity.EmvMessage;
import repository.EmvRepository;

public class EmvServiceImpl implements EmvService{

    private EmvRepository emvRepository;

    public EmvServiceImpl(EmvRepository emvRepository) {
        this.emvRepository = emvRepository;
    }

    @Override
    public void showEmvMessage() {
        EmvMessage[] model = emvRepository.getAll();

        System.out.println("EMV MESSAGE");
        for (int i = 0; i < model.length; i++) {
            var emvMessage = model[i];
            var no = i + 1;

            if ( emvMessage != null){
                System.out.println(no + ". " + emvMessage.getEmv());
            }
        }
    }

    @Override
    public void addEmvMessage() {

    }

    @Override
    public void removeEmvMessage(Integer number) {

    }
}
