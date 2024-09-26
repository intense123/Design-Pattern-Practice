class artdecoFurnitureFactory implements furniturefactory {
    @Override
    public chair createchair() {
        return new artdecochair();
    }

    @Override
    public sofa createsofa() {
        return new artdecosofa();
    }

    @Override
    public coffeetable createcoffeetable() {
        return new artdeceocoffeetable();
    }
}