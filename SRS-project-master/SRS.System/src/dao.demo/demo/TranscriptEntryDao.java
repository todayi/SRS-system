package dao.demo;

import java.util.List;

import model.demo.TranscriptEntry;

public interface TranscriptEntryDao {
	List<TranscriptEntry> getAllTranscriptEntrys();
	TranscriptEntry getTranscriptEntry(int transcriptEntryNo);
	void addTranscriptEntry(TranscriptEntry transcriptEntry);
	void deleteTranscriptEntry(TranscriptEntry transcriptEntry);
	void updateTranscriptEntry(TranscriptEntry transcriptEntry);
}
