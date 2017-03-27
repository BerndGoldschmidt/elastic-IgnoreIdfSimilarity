package de.berndgoldschmidt;

import org.apache.lucene.search.similarities.Similarity;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.*;

public class IgnoreIdfSimilarityProvider extends AbstractSimilarityProvider {

    private IgnoreIdfSimilarity similarity;

    @Inject
    public IgnoreIdfSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
        super(name);
        this.similarity = new IgnoreIdfSimilarity();
    }

    @Override
    public Similarity get() {
        return similarity;
    }

}
