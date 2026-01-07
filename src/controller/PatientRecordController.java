/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.PatientRecord;

import java.util.HashMap;
import java.util.Map;

public class PatientRecordController {

    private Map<String, PatientRecord> records;

    public PatientRecordController() {
        records = new HashMap<>();
    }

    public PatientRecord getOrCreateRecord(String patientId) {
        if (!records.containsKey(patientId)) {
            records.put(patientId,
                    new PatientRecord("REC" + System.currentTimeMillis(), patientId));
        }
        return records.get(patientId);
    }

    public void addNote(String patientId, String note) {
        PatientRecord record = getOrCreateRecord(patientId);
        record.addNote(note);
    }
}
