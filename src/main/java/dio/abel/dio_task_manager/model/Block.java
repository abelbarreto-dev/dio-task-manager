package dio.abel.dio_task_manager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String  blockCause;
    private OffsetDateTime blockIn;
    private boolean locked = true;
    @Column(length = 255)
    private String  unblockCause;
    private OffsetDateTime unblockIn;
    private boolean deleted = false;

    @ManyToOne
    @JoinColumn(name = "card_id", nullable = false)
    private Card card;
}
