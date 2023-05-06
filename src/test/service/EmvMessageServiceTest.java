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
        emvRepository.data[4] = new EmvMessage("9B");
        emvRepository.data[5] = new EmvMessage("9F06");
        emvRepository.data[6] = new EmvMessage("57");
        emvRepository.data[7] = new EmvMessage("5A");
        emvRepository.data[8] = new EmvMessage("5F34");
        emvRepository.data[9] = new EmvMessage("9F27");
        emvRepository.data[10] = new EmvMessage("9F26");
        emvRepository.data[11] = new EmvMessage("9F10");
        emvRepository.data[12] = new EmvMessage("82");
        emvRepository.data[13] = new EmvMessage("9F36");
        emvRepository.data[14] = new EmvMessage("5F20");
        emvRepository.data[15] = new EmvMessage("8C");
        emvRepository.data[16] = new EmvMessage("9F02");
        emvRepository.data[17] = new EmvMessage("9F07");
        emvRepository.data[18] = new EmvMessage("95");
        emvRepository.data[19] = new EmvMessage("9F09");
        emvRepository.data[20] = new EmvMessage("9F41");
        emvRepository.data[21] = new EmvMessage("9C");
        emvRepository.data[22] = new EmvMessage("5F2A");
        emvRepository.data[23] = new EmvMessage("9F1A");
        emvRepository.data[24] = new EmvMessage("9F1B");
        emvRepository.data[25] = new EmvMessage("9F33");
        emvRepository.data[26] = new EmvMessage("9F34");
        emvRepository.data[27] = new EmvMessage("9F35");
        emvRepository.data[28] = new EmvMessage("5F36");
        emvRepository.data[28] = new EmvMessage("9A");
        emvRepository.data[28] = new EmvMessage("9F37");

        emvRepository.desc[0] = new EmvMessage("Application Identifier (AID)");
        emvRepository.desc[1] = new EmvMessage("Issuer Application Data");
        emvRepository.desc[2] = new EmvMessage("Application Cryptogram");
        emvRepository.desc[3] = new EmvMessage("Cryptogram Information Data");
        emvRepository.desc[4] = new EmvMessage("Terminal Verification Results");
        emvRepository.desc[5] = new EmvMessage("Track 2 Equivalent Data");
        emvRepository.desc[6] = new EmvMessage("Application Primary Account Number (PAN)");
        emvRepository.desc[7] = new EmvMessage("Application Primary Account Number (PAN) Sequence Number");
        emvRepository.desc[8] = new EmvMessage("Application Primary Account Number (PAN) Sequence Number");
        emvRepository.desc[9] = new EmvMessage("Application Primary Account Number (PAN) Sequence Number");
        emvRepository.desc[10] = new EmvMessage("Application Primary Account Number (PAN) Sequence Number");
        emvRepository.desc[11] = new EmvMessage("Issuer Application Data");
        emvRepository.desc[12] = new EmvMessage("Application Interchange Profile");
        emvRepository.desc[13] = new EmvMessage("Application Transaction Counter (ATC)");
        emvRepository.desc[14] = new EmvMessage("Cardholder Name");
        emvRepository.desc[15] = new EmvMessage("Card Risk Management Data Object List 1 (CDOL1)");
        emvRepository.desc[16] = new EmvMessage("Amount, Authorised (Numeric)");
        emvRepository.desc[17] = new EmvMessage("Application Usage Control");
        emvRepository.desc[18] = new EmvMessage("Application Usage Control");
        emvRepository.desc[19] = new EmvMessage("Application Usage Control");
        emvRepository.desc[20] = new EmvMessage("Application Usage Control");
        emvRepository.desc[21] = new EmvMessage("Application Usage Control");
        emvRepository.desc[22] = new EmvMessage("Application Usage Control");
        emvRepository.desc[23] = new EmvMessage("Application Usage Control");
        emvRepository.desc[23] = new EmvMessage("Application Usage Control");
        emvRepository.desc[24] = new EmvMessage("");
        emvRepository.desc[24] = new EmvMessage("");
        emvRepository.desc[24] = new EmvMessage("");


        EmvService emvService = new EmvServiceImpl(emvRepository);
        EmvService emvService1 = new EmvServiceImpl(emvRepository);

        emvService.showEmvMessage();
        emvService1.showEmvMessage();

    }
}
