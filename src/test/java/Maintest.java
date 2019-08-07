public abstract class Maintest {

    Animal animal;

    public void testMain() {
        animal = getName();

        voiceCheck();
    }
    public void voiceCheck() throws VoiceException {

        char[] result = animal.getVoice().toCharArray();
        int countLow = 0;

        for (char a : result)
        {
            if (Character.isLowerCase(a))
                countLow++;
        }

        if (countLow > 0) {
            throw new RuntimeException("ERROR low case symbols");
        }

        if (result.length > 10) {
            throw new RuntimeException(("ERROR Voice too long"));
        }
    }
    abstract Animal getName();
}