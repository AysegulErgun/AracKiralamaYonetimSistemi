public class SporArabaFactory implements IAracFactory{
    @Override
    public IMotor motoruUret() {
        return new SporArabaMotor();
    }

    @Override
    public ILastik lastigiUret() {
        return new SporArabaLastik();
    }

    @Override
    public IIcMekan icMekanUret() {
        return new SporArabaIcMekan();
    }
}
