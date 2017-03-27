# elastic-IgnoreIdfSimilarity

Similarity plugin for elastic search 2.4 to ignore the IDF (inverse document frequency).

Sets idf to a static 1.0f.

Tested for **elastic search 2.4.1** and **Java 1.7**.

# Usage

Use `./install.sh` to build and install plugin. Eventually set `ES_DIR` in `install.sh` to the appropriate directory.

Make sure you add similarity to the index' settings:

    "similarity": {
        "ignore-idf-similarity": {
            "type": "ignoreidfsimilarity"
        }
    }

and use it in the mappings of the index:

    "fieldname": {
        "type": "string",
        "similarity": "ignore-idf-similarity"
    }

