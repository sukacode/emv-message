package test.service;

import entity.EmvMessage;
import repository.EmvRepositoryImpl;
import service.EmvService;
import service.EmvServiceImpl;

public class EmvMessageServiceTest {
    public static void main(String[] args) {
    testShowEmvMessage();
    }

    public static void testShowEmvMessage(){
        EmvRepositoryImpl emvRepository = new EmvRepositoryImpl();
        emvRepository.data[0] = new EmvMessage("9F06");
        emvRepository.data[1] = new EmvMessage("9F10");
        emvRepository.data[2] = new EmvMessage("9F26");
        emvRepository.data[3] = new EmvMessage("9F27");
        emvRepository.data[4] = new EmvMessage("95");
        emvRepository.data[5] = new EmvMessage("9B");
        emvRepository.data[6] = new EmvMessage("57");
        emvRepository.data[7] = new EmvMessage("5A");
        emvRepository.data[8] = new EmvMessage("5F34");
        emvRepository.data[9] = new EmvMessage("9F27");
        emvRepository.data[10] = new EmvMessage("9F26");
        emvRepository.data[11] = new EmvMessage("9F10");
        emvRepository.data[12] = new EmvMessage("82");
        emvRepository.data[13] = new EmvMessage("9F36");
        emvRepository.data[14] = new EmvMessage("9F20");
        emvRepository.data[15] = new EmvMessage("82");
        emvRepository.data[16] = new EmvMessage("9F36");
        emvRepository.data[17] = new EmvMessage("9F20");
        emvRepository.data[18] = new EmvMessage("9F26");
        emvRepository.data[19] = new EmvMessage("9F26");
        emvRepository.data[20] = new EmvMessage("9F26");

        EmvService emvService = new EmvServiceImpl(emvRepository);

        emvService.showEmvMessage();

    }
}
