package com.example.medicines;

public class Meds {
    String medicines;
    String indications;
    String therapeutic_class;
    String pharmacology;
    String dosage;
    String interaction;
    String contraindications;
    String side_effects;
    String pregnancy;
    String precautions;
    String storage;


    public Meds(String medicines, String indications, String therapeutic_class, String pharmacology, String dosage, String interaction, String contraindications, String side_effects, String pregnancy, String precautions, String storage) {
        this.medicines = medicines;
        this.indications = indications;
        this.therapeutic_class = therapeutic_class;
        this.pharmacology = pharmacology;
        this.dosage = dosage;
        this.interaction = interaction;
        this.contraindications = contraindications;
        this.side_effects = side_effects;
        this.pregnancy = pregnancy;
        this.precautions = precautions;
        this.storage = storage;
    }

    public String getMedicines() {
        return medicines;
    }

    public String getIndications() {
        return indications;
    }

    public String getTherapeutic_class() {
        return therapeutic_class;
    }

    public String getPharmacology() {
        return pharmacology;
    }

    public String getDosage() {
        return dosage;
    }

    public String getInteraction() {
        return interaction;
    }

    public String getContraindications() {
        return contraindications;
    }

    public String getSide_effects() {
        return side_effects;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public String getPrecautions() {
        return precautions;
    }

    public String getStorage() {
        return storage;
    }
}
