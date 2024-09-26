class modernfurniturefactory implements furniturefactory {
    @Override
    public chair createchair() {
        return new modernchair();
    }

    @Override
    public sofa createsofa() {
        return new modernsofa();
    }

    @Override
    public coffeetable createcoffeetable() {
        return new moderncoffeetable();
    }
}
