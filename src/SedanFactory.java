public class SedanFactory implements IAracFactory{
    @Override
    public IMotor motoruUret() {
        return new SedanMotor();
    }

    @Override
    public ILastik lastigiUret() {
        return new SedanLastik();
    }

    @Override
    public IIcMekan icMekanUret() {
        return new SedanIcMekan();
    }
}
