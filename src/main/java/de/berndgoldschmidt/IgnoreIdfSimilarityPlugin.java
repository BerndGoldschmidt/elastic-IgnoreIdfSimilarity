package de.berndgoldschmidt;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.Plugin;

public class IgnoreIdfSimilarityPlugin extends Plugin {

    @Override
    public String name() {
        return "ignore-idf-similarity-plugin";
    }

    @Override
    public String description() {
        return "Ignore IDF Similarity Plugin";
    }

    public void onModule(final SimilarityModule module) {
        module.addSimilarity("ignoreidfsimilarity", IgnoreIdfSimilarityProvider.class);
    }
}
