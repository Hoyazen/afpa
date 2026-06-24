import { useEffect, useRef, useState } from "react";

import styles from "./ClockPage.module.css";

/**
 * Page présentant une horloge interactive
 */
const ClockPage = () => {

    // TODO déclarer un state permettant de stocker la date et l'heure actuelle
    // Indice sur ce qu'il faudrait stocker : https://developer.mozilla.org/fr/docs/Web/JavaScript/Reference/Global_Objects/Date
    const [currentDate, setCurrentDate] = useState(new Date());

    const intervalRef = useRef(null);

    useEffect(() => {
        return () => {
            if (intervalRef.current) {
                clearInterval(intervalRef.current);
            }
        };
    }, []);

    /**
     * TODO fonction permettant de démarrer l'horloge
     */
    function handleStartClick() {
        if (intervalRef.current) {
            return;
        }

        intervalRef.current = setInterval(() => {
            setCurrentDate(new Date());
        }, 1000);
    }

    /**
     * TODO fonction permettant de stopper l'horloge
     */
    function handleStopClick() {
        if (intervalRef.current) {
            clearInterval(intervalRef.current);
            intervalRef.current = null;
        }
    }

    return (
        <div className={styles.clockContainer}>
            {/* TODO implémenter l'interface graphique de l'horloge */}
            <h1>Horloge</h1>

            <p>{currentDate.toLocaleDateString()}</p>
            <p>{currentDate.toLocaleTimeString()}</p>

            <button onClick={handleStartClick}>
                Démarrer
            </button>

            <button onClick={handleStopClick}>
                Arrêter
            </button>
        </div>
    );
}

export default ClockPage;