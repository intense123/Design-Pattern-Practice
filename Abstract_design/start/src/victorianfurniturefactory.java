class victorianfurniturefactory implements furniturefactory {
    @Override
    public chair createchair() {
        return new victorianchair();
    }

    @Override
    public sofa createsofa() {
        return new victoriansofa();
    }

    @Override
    public coffeetable createcoffeetable() {
        return new victoriancoffeetable();
    }
}