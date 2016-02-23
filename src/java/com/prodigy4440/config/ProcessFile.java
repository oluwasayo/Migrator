/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.config;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author prodigy4440
 */
@Entity
@Table(name = "process_file")
public class ProcessFile implements Serializable {

  private static final long serialVersionUID = 65433029880815586L;

  @Id
  @Column(name = "process_file_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long processFileId;

  @Column(name = "file_path")
  private String filePath;

  @Column(name = "current_id")
  private Integer currentId;

  @Enumerated(EnumType.STRING)
  private Status status;

  public ProcessFile() {
  }

  public ProcessFile(String filePath, Integer currentId, Status status) {
    this.filePath = filePath;
    this.currentId = currentId;
    this.status = status;
  }

  public Long getProcessFileId() {
    return processFileId;
  }

  public void setProcessFileId(Long processFileId) {
    this.processFileId = processFileId;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public Integer getCurrentId() {
    return currentId;
  }

  public void setCurrentId(Integer currentId) {
    this.currentId = currentId;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 23 * hash + Objects.hashCode(this.processFileId);
    hash = 23 * hash + Objects.hashCode(this.filePath);
    hash = 23 * hash + Objects.hashCode(this.currentId);
    hash = 23 * hash + Objects.hashCode(this.status);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final ProcessFile other = (ProcessFile) obj;
    if (!Objects.equals(this.filePath, other.filePath)) {
      return false;
    }
    if (!Objects.equals(this.currentId, other.currentId)) {
      return false;
    }
    if (!Objects.equals(this.processFileId, other.processFileId)) {
      return false;
    }
    if (this.status != other.status) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "ProcessFile{" + "processFileId=" + processFileId + ", filePath=" + filePath + ", currentId=" + currentId + ", status=" + status + '}';
  }

  public enum Status {
    PROCESSED,
    PROCESSING,
    UNPROCESS;
  }

}
