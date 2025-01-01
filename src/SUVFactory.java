public class SUVFactory implements IAracFactory{
    @Override
    public IMotor motoruUret() {
        return new SUVMotor();
    }

    @Override
    public ILastik lastigiUret() {
        return new SUVLastik();
    }

    @Override
    public IIcMekan icMekanUret() {
        return new SUVIcMekan();
    }
}
